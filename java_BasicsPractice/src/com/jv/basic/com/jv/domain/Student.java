package com.jv.basic.com.jv.domain;

import java.io.Serializable;

public class Student implements Serializable {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String name;
        public String age;
        private Integer uid = 0;

    public Integer getUid() {
        return uid;
    }

    public Integer uuid = 1;

}


