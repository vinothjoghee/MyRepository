package com.k2js.oops.upcasting;

public class HeroineFather {
	public static void main(String[] args) {
		Abishek abi=new Abishek();
		abi.sportsTeam();
		abi.awards();
		abi.tvshow();
		abi.tvAdvertisement();
		abi.hitmovie();
		abi.marriageOpinion();
		
		//while upcasting ,we can see only parent class methods
		Amitab ami=new Abishek();
		ami.awards();
		ami.tvshow();
		ami.tvAdvertisement();
		ami.hitmovie();
		ami.marriageOpinion();//In compile time it will point to parent(Amitab) and in run time it will point to child
		
		
		//Downcasting begnins -here  you can find all the methods both parent and child methods
		
		System.out.println("********************");
		
		Abishek a=(Abishek)ami;
		a.awards();
		a.hitmovie();
		a.sportsTeam();
		a.tvAdvertisement();
		a.tvshow();
		a.marriageOpinion();
		
	
	}

}
