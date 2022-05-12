package com.qa.main.day4;

public class Privacy {

		private String name;
		private int age;
		private boolean alive;
		
		public Privacy(String name, int age, boolean alive) {
			super();
			this.name = name;
			this.age = age;
			this.alive = alive;
		}
		@Override
		public String toString() {
			return "Privacy [name=" + name + ", age=" + age + ", alive=" + alive + "]";
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			if (age < 130) {
				this.age = age;}
			else {
				System.out.println("probably dead");
			}
		}
}
