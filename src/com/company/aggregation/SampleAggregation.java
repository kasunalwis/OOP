package com.company.aggregation;

/**
 * Created by kalwis on 6/2/2016.
 */
public class SampleAggregation {
    /*
    If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

    Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one
    more object named address, which contains its own informations such as city, state, country, zipcode etc.

    In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.
     */
}

    class Address {
        String city, state, country;

        public Address(String city, String state, String country) {
            this.city = city;
            this.state = state;
            this.country = country;
        }

    }

    class Emp {
        int id;
        String name;
        Address address;

        public Emp(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        void display() {
            System.out.println(id + " " + name);
            System.out.println(address.city + " " + address.state + " " + address.country);
        }

        public static void main(String[] args) {
            Address address1 = new Address("gzb", "UP", "india");
            Address address2 = new Address("gno", "UP", "india");

            Emp e = new Emp(111, "varun", address1);
            Emp e2 = new Emp(112, "arun", address2);

            e.display();
            e2.display();

        }
    }