package main;

public class Identity {
	private int age;
	private boolean member;
	private boolean group;
	
	public Identity(int age, boolean member, boolean group) {
		this.age = age;
		this.member = member;
		this.group = group;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}
}
