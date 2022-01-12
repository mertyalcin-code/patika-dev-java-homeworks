interface HesapMakinesi
{
    void hesapla(int item);
}
class Patika implements HesapMakinesi
{
    int x;
    public void hesapla(int item)
    {
        x = item * item;
    }
}
class main
{
    public static void main(String args[]) {
        Patika obj = new Patika();
        obj.x = 0;
        obj.hesapla(2);
        System.out.print(obj.x);
    }
}