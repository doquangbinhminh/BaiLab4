
public class BenhNhan extends Nguoi {
	String tienSu,chanDoan;
    BenhVien bv;;
    public BenhNhan(String ten,int tuoi,String gioiTinh,String tienSu,String chanDoan,BenhVien bv){
        super(ten,tuoi,gioiTinh);
        this.chanDoan=chanDoan;
        this.tienSu=tienSu;
        this.bv=bv;
    }
    public String gettienSu(){
        return tienSu;
    }
    public void settienSu(String tienSu){
        this.tienSu=tienSu;
    }
    public String getchanDoan(){
        return chanDoan;
    }
    public void setchanDoan(String chanDoan){
        this.chanDoan=chanDoan;
    }
    public String toString(){
        return super.toString()+"\nTien su benh: "+tienSu+"\nChan doan benh: "+chanDoan+bv;
    }
}

