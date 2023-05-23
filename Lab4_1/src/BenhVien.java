
public class BenhVien {
	String tenbv,diaChi,giamDoc;
    public BenhVien(String tenbv,String diaChi,String giamDoc){
        this.tenbv=tenbv;
        this.diaChi=diaChi;
        this.giamDoc=giamDoc;
    }
    public String gettenbv(){
        return tenbv;
    }
    public void setten(String tenbv){
        this.tenbv=tenbv;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    public String getgiamDoc(){
        return giamDoc;
    }
    public void setgiamDoc(String giamDoc){
        this.giamDoc=giamDoc;
    }
	@Override
	public String toString() {
		return "BenhVien [tenbv=" + tenbv + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
    
    }


