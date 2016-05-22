import java.util.Vector;

public class Pemasok {

  public Integer KdPemasok;

  public String NamaPemasok;

  public String AlamatPemasok;

  public String KodePos;

  public String Provinsi;

    /**
   * 
   * @element-type Barang
   */
  public Vector  mempunyai;
public class Barang {

  public Integer KdBarang;

  public String NamaBarang;

  public UnlimitedInteger HargaBeli;

  public UnlimitedInteger HargaJual;

  public String Kategori;

    /**
   * 
   * @element-type Pemasok
   */
  public Vector  mempunyai;

  public void AddBarang() {
  }

}
  public void AddPemasok() {
  }

}