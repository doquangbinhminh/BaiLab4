
public class Main {
	public static void main(String[] args) {
	    BenhVien bv=new BenhVien("Da khoa Phuong Dong", "Ha Noi", "khong");
	    BenhNhan bn=new BenhNhan("Minh", 20, "nam", "khong", "khong",bv);
	    System.out.println(bn);
	}
}
