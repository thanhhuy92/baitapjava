import java.io.*;
import java.util.Scanner;

public class HinhChuNhat {
	
	protected double chieudai, chieurong, chuvi, dientich;
	
	Scanner scanner=new Scanner(System.in);
	
	public void nhap() {
		do {
			System.out.println("Nhap chieu dai hinh chu nhat: ");
			chieudai=scanner.nextDouble();
			System.out.println("Nhap chieu rong hinh chu nhat");
			chieurong=scanner.nextDouble();
		}while(chieudai<chieurong);
	}
	
	public void hienthi(double dai,double rong) {
		System.out.println("Chieu dai la "+ chieudai +" va chieu rong la "+ chieurong);
	}
	
	public double tinhchuvi(double dai,double rong) {
		chuvi=(dai+rong)*2;
		return chuvi;
	}
	
	public double tinhdientich(double dai,double rong) {
		dientich=dai*rong;
		return dientich;
	}
	
	public void hienthichuvivadientich(double cv,double dt) {
		System.out.println("Chu vi hinh chu nhat: "+cv);
		System.out.println("Dien tich hinh chu nhat: "+dt);
	}
	
	public static void main(String[] args) {
		HinhChuNhat hinhchunhat=new HinhChuNhat();
		
		//nhap chieu dai va chieu rong
		hinhchunhat.nhap();
		
		//hien thi chieu dai va chieu rong
		hinhchunhat.hienthi(hinhchunhat.chieudai, hinhchunhat.chieurong);
		
		//tinh chu vi va dien tich
		double chuVi=hinhchunhat.tinhchuvi(hinhchunhat.chieudai, hinhchunhat.chieurong);
		double dienTich=hinhchunhat.tinhdientich(hinhchunhat.chieudai, hinhchunhat.chieurong);
		
		//hienthi ket qua chu vi va dien tich
		hinhchunhat.hienthichuvivadientich(chuVi, dienTich);
	}

}
