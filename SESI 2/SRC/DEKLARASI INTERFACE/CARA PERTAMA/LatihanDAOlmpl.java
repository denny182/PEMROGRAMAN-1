public class LatihanDAOImpl implements LatihanDAO{
    public void save(Latihan l){
     System.out.println("menyimpan latihan");
    }
    public void delete(Latihan l){
     System.out.println("Menghapus Latihan");
    }
    public Latihan getByid(long id){
      Latihan l = new Latihan();
      l.setId(id);
      l.setNama("abc");
      return l;
    }
} 