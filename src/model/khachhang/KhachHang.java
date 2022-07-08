package model;

import java.util.Date;
import java.util.Objects;

public class KhachHang {
	private String tenKhachHang;
	private String maKhachHang;
	private String diaChi;
	private String sdt;
	private GioiTinh gioiTinh;
	private Date ngaySinh;
	
	public KhachHang(String tenKhachHang, String diaChi, String sdt, GioiTinh gioiTinh, Date ngaySinh) {
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaKhachHang() {
		String s1 = tenKhachHang.substring(tenKhachHang.length()-1);
		String s2 = sdt.substring(sdt.length()-3, sdt.length());
		String s3 = diaChi.substring(diaChi.length()-2, diaChi.length()-1);
//		String maKhachHang = (new StringBuilder()).append(s1).append(s2).append(s3).toString();
//		return maKhachHang;
		return (new StringBuilder()).append(s1).append(s2).append(s3).toString();
	}

	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	@Override
	public String toString() {
		String maKhachHang = getMaKhachHang();
		return "KhachHang [tenKhachHang=" + tenKhachHang + ", maKhachHang=" + maKhachHang + ", diaChi=" + diaChi
				+ ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(diaChi, gioiTinh, maKhachHang, ngaySinh, sdt, tenKhachHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(diaChi, other.diaChi) && Objects.equals(gioiTinh, other.gioiTinh)
				&& Objects.equals(maKhachHang, other.maKhachHang) && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(sdt, other.sdt) && Objects.equals(tenKhachHang, other.tenKhachHang);
	}
}
