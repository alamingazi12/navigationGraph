package com.gktech.navigationgraph;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private  int id;
    private  int price;
    private String quality;

    public Product(int id, int price, String quality) {
        this.id = id;
        this.price = price;
        this.quality=quality;
    }

    protected Product(Parcel in) {
        id = in.readInt();
        price = in.readInt();
        quality=in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(price);
        dest.writeString(quality);
    }
}
