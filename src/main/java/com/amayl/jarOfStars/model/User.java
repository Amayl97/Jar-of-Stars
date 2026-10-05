package com.amayl.jarOfStars.model;

import java.util.List;

public class User {
   private String uid;
   private String name;
   private String email;
   private String passwordHash;
   private String authProvider;
   private List<String> sentJarIds;
   private List<String> receivedJarIds;
}