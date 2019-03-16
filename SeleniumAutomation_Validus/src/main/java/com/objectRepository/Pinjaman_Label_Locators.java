package com.objectRepository;

import org.openqa.selenium.By;

public class Pinjaman_Label_Locators {

	/*WebDriver driver;
	public DBSBusinessAccOpening_Loc(WebDriver driver){
		this.driver=driver;
	}
	*/
	public By login=By.xpath("//li[@class='Login-button']");
	public By password=By.xpath("//input[@name='password']");
	
	public By pinjaman_back = By.xpath("//a[text()='halaman utama']");
	
	public By pinjaman_LoginHeading=By.xpath("//a[text()='Selamat Datang silahkan masuk menggunakan akun batumbu Anda']");
	public By pinjaman_username = By.xpath("//span[text()='Nama Pengguna dan Kata Sandi peka huruf besar-huruf kecil']");
	public By pinjaman_termsCondi = By.xpath("//p[text()='Kami/saya menyetujui untuk terikat dengan ']");
	public By pinjaman_loginButton = By.xpath("//button[text()='Masuk']");
	public By pinjaman_reset = By.xpath("//li[text()='Lupa kata sandi Anda? Atur ulang sekarang ']");
	public By pinjaman_resetLink = By.xpath("//a[text()=' Set ulang sekarang.']");
	public By pinjaman_createaccount = By.xpath("//a[text()=' Buat akun baru ']");
	public By pinjaman_caheading = By.xpath("//h4[text()='Pendaftaran ']");
	public By pinjaman_casubheading = By.xpath("//p[text()='Pilih Jenis Pendaftaran ']");
	public By pinjaman_investor = By.xpath("//button[text()='Investor']");
	public By pinjaman_sme = By.xpath("//button[text()='UKM']");
	public By pinjaman_investorca =  By.xpath("//a[text()='Buat Akun Baru ']");
	public By pinjaman_registerasinvestor = By.xpath("//h3[text()='Anda mendaftar sebagai Investor']");
	public By pinjaman_emailId = By.xpath("//label[text()='Alamat email']");
	public By pinjaman_emailIDtwo = By.xpath("//span[text()=' (Ini akan menjadi Nama Pengguna Anda)']");
	public By pinjaman_password = By.xpath("//label[text()='Kata sandi ']");
	public By pinjaman_passwordtwo = By.xpath("//span[text()=' (8 karakter & harus menyertakan angka dan huruf besar)']");
	public By pinjaman_confirmpassword = By.xpath("//label[text()='konfirmasi sandi']");
	public By pinjaman_phonenumber = By.xpath("//label[text()='Nomor handphone']");
	public By pinjaman_TandCone = By.xpath("(//span[text()='Kami / saya mengakui dan setuju untuk terikat dengan ketentuan yang ditetapkan dalam '])[1]");
	public By pinjaman_TandCtwo = By.xpath("(//a[text()='Kebijakan pribadi '])[1]");
	public By pinjaman_TandCthree = By.xpath("(//span[text()=' yang berisi informasi penting tentang berinvestasi di Platform.'])[1]");
	public By pinjaman_continue = By.xpath("(//button[text()='Continue'])[1]");
	
}
