package com.caneroksuz._05_hiyerarsi_Kurma;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Results {

    private String gender;
    private String email;
    private String phone;
    private String cell;
    private String nat;

    private Name name;
    private Location location;
    private Login login;
    private Dob dob;
    private Registered registered;
    private Id id;
    private Picture picture;

    private class Name {

        private String title;
        private String first;
        private String last;
    }

    private class Location {
        private String city;
        private String state;
        private String coutry;
        private int postcode;

        private Streat streat;
        private Coordinate coordinate;
        private Timezone timezone;

        private class Streat {
            private int number;
            private String name;
        }

        private class Coordinate {
            private String latitude;
            private String longitude;
        }

        private class Timezone {
            private String offset;
            private String description;
        }
    }

    private class Login {
        private String uuid;
        private String username;
        private String password;
        private String salt;
        private String md5;
        private String sha1;
        private String sha256;
    }

    private class Dob {
        private String date;
        private String age;

    }

    private class Registered {
        private String date;
        private String age;
    }

    private class Id {
        private String name;
        private String value;
    }

    private class Picture {
        private String large;
        private String medium;
        private String thumbnail;
    }
}
