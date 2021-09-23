package com.observer;

public class YouTub {
	public static void main(String[] args) {
		Channel myChannel=new Channel();    // subject
		
		Subscriber  s1= new Subscriber("A");// observers
		Subscriber  s2= new Subscriber("B");
		Subscriber  s3= new Subscriber("C");
		Subscriber  s4= new Subscriber("D");
		Subscriber  s5= new Subscriber("E");
		Subscriber  s6= new Subscriber("F");
		
		myChannel.subscribe(s1);
		myChannel.subscribe(s2);
		myChannel.subscribe(s3);
		myChannel.subscribe(s4);
		myChannel.subscribe(s5);
		myChannel.subscribe(s6);
		
		
		s1.subscribeChannel(myChannel);
		s2.subscribeChannel(myChannel);
		s3.subscribeChannel(myChannel);
		s4.subscribeChannel(myChannel);
		s5.subscribeChannel(myChannel);
		s6.subscribeChannel(myChannel);
		myChannel.upload("design pattern vedio uploaded");
		
	}

}
