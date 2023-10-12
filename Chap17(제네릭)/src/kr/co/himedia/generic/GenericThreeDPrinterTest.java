package kr.co.himedia.generic;

import kr.co.himedia.nongeneric.Plastic;
import kr.co.himedia.nongeneric.Powder;

public class GenericThreeDPrinterTest {
   
   public static void main(String[] args) {
      
      GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
      powderPrinter.setMaterial(new Powder());
      System.out.println(powderPrinter);
      
      
      GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
      plasticPrinter.setMaterial(new Plastic());
      System.out.println(plasticPrinter);
      
      GenericThreeDPrinterTest waterPrinter = new GenericThreeDPrinterTest();
      
      //Generic에서 자료형 setMaterial타입자체를 추론할수있다
      GenericThreeDPrinter printer = new GenericThreeDPrinter<>();
      printer.setMaterial(new Powder());
      
      var printer2 = new GenericThreeDPrinter();	//타입 명시 안하고[var]사용하여  printer2을 Plastic로 명시 가능 
      printer2.setMaterial(new Plastic());
      System.out.println();
      
   }

}