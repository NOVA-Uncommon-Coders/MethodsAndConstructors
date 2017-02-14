package com.theironyard.novauc;

/**
 * Created by jerieshasmith on 2/7/17.
 */
public class Children {
 int age;
 String name;
 int shoeSize;
 String parent;
 Boolean IsAlive;


 public Children(int shoeSize) {
  int size = 8;

  if (size == 8) {
   System.out.println("Input another siz: ");

  }

  this.shoeSize = shoeSize;
 }



 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getShoeSize() {
  return shoeSize;
 }

 public void setShoeSize(int shoeSize) {
  this.shoeSize = shoeSize;
 }

 public String getParent() {
  return parent;
 }

 public void setParent(String parent) {
  this.parent = parent;
 }

 public Boolean getAlive() {
  return IsAlive;
 }

 public void setAlive(Boolean alive) {
  IsAlive = alive;
 }
}
