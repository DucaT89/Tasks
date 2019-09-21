package testiranje;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka.Account;

public class AccountTest {
	//Zad1 a/
  @Test
  public void testKonstruktor() {
	  String ime="Zlatko",brojRacuna="0001";
	  double pocVrednost=0;
	  Account acc= new Account(ime, brojRacuna);
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(acc.getName(), ime,"Pogresno ime unutar kons ili getera");
	  sa.assertEquals(acc.getNumber(), brojRacuna,"Pogresan broj racuna");
	  sa.assertEquals(acc.getAmount(), pocVrednost,"Losa pocetna vrednost");
	  sa.assertAll();
	  
  }
  @Test
  public void testGetSet() {
	  String ime="Zlatko",brojRacuna="0001";
	  double pocVrednost=0,novaVr=150000;
	  
	  Account acc= new Account(ime, brojRacuna);
	  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(acc.getName(), ime,"Pogresno ime unutar kons ili getera");
	  sa.assertEquals(acc.getNumber(), brojRacuna,"Pogresan broj racuna");
	  sa.assertEquals(acc.getAmount(), pocVrednost,"Losa pocetna vrednost");
	  sa.assertAll();
	  
	  acc.setAmount(novaVr);
	  Double vred=novaVr;
	  Assert.assertEquals(acc.getAmount(), vred,"Lose postavljeno");
	  
	  
  }@Test
   public void testtoString() {
	  String ime="Zlatko",brojRacuna="0001";
	  double stanje=0.00;
	  Account acc=new Account(ime,brojRacuna);
	 String s= String.format("%s\t%s\t%.2f", acc.getName(),acc.getNumber(),acc.getAmount()); 
	Assert.assertEquals(acc.toString(),s);
  }
  
  @Test
  public void nalog() {
	  String ime = "MArko";
	  int max=100;
	  ArrayList<Account> nalog = new ArrayList<>(); 
	  for( int i=0;i<max;i++) {
		  Account a=new Account(ime);
		  nalog.add(a);  
	  }
	  
	  for(int i=0;i<max-1;i++) {
		  for(int j=i+1;j<max;j++) {
			  Assert.assertNotEquals(nalog.get(i), nalog.get(j));
		  }
	  } 
	  
  }
}
