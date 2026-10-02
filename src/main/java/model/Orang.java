package model;

// Abstract class: superclass untuk OrangTua dan Anak.
// Menyimpan data yang sama-sama dimiliki keduanya: id dan nama.
// Tidak boleh dibuat objeknya langsung (new Orang(...) akan error),
// hanya boleh lewat subclass-nya.
public abstract class Orang {
    private String id;
    private String nama;

    public Orang(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Abstract method
    public abstract String getPeran();

    // Method biasa
    @Override
    public String toString() {
        return "[" + getPeran() + "] ID: " + id + " | Nama: " + nama;
    }
}
