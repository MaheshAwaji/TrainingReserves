package com.te.LearnJava8.oops.inheritance.upcastingAndDowncasting;

public class WhatsAppGroup {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Member member1=new Member();
		Member member2=new Member();
		Member member3=new Member();
		
		if (member1 instanceof Admin) {
			
			Admin admin=(Admin) member1;
			admin.addMember();
			admin.sendMessage();
			
		}else {
			System.out.println("member1 is not a type of Admin");
		}
		
		
		
		
		
//		Admin admin=new Admin();
//		admin.addMember();
//		admin.removeMember();
//		admin.sendMessage();
//		
//		Member member=admin;//Upcasting
//		member.deleteMessage();
//		member.videoCalling();
//		
//		Admin admin2=(Admin)member;//Downcasting
//		admin2.addMember();
//		admin2.sendMessage();
		
//		Member member1=new Member();
//		member1.sendMessage();
//		member1.deleteMessage();
		
		
		
	}

}
