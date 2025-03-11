package com.example.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.List;

public class PolymorphicDeserializationDemo {


    // 父类
    @Data
    public static class Animal {
        private String name;
        private int type; // 用于区分子类的字段

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    // 子类 Cat
    @Data
    public static class Cat extends Animal {

        private int age;
        @Override
        public String toString() {
            return "Cat{name='" + getName() + "'}";
        }
    }

    // 子类 Dog
    @Data
    public static class Dog extends Animal {
        private int size;
        @Override
        public String toString() {
            return "Dog{name='" + getName() + "'}";
        }
    }

    // 自定义反序列化逻辑
    public static class AnimalDeserializer extends JavaBeanDeserializer implements ObjectDeserializer {

        public AnimalDeserializer() {
            super(ParserConfig.getGlobalInstance(), Animal.class);
        }

        @Override
        public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser parser, Type type, Object fieldName) {
            // 解析当前 JSON 对象为 JSONObject
            com.alibaba.fastjson.JSONObject jsonObject = parser.parseObject();

            // 根据 type 字段判断应该反序列化为哪个子类
            int animalType = jsonObject.getIntValue("type");
            if (animalType == 1) {
                return (T) JSON.parseObject(jsonObject.toJSONString(), Cat.class);
            } else if (animalType == 2) {
                return (T) JSON.parseObject(jsonObject.toJSONString(), Dog.class);
            }

            // 默认返回父类实例
            return (T) JSON.parseObject(jsonObject.toJSONString(), Animal.class);
        }

        @Override
        public int getFastMatchToken() {
            return 0;
        }
    }

    public static void main(String[] args) {
        String jsonStr = "[{\"type\":1,\"name\":\"Buddy\",\"age\":3},{\"type\":2,\"name\":\"Whiskers\",\"size\":13}]";

        // 注册自定义反序列化器
        ParserConfig.getGlobalInstance().putDeserializer(Animal.class, new AnimalDeserializer());

        // 反序列化 JSON 字符串为 Animal 列表
        List<Animal> animals = JSON.parseArray(jsonStr, Animal.class);

        // 输出结果
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

}
