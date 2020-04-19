package com.ugwulo.groceryshop;


import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    String item1, item2;
    int price1, price2;

    protected Item(Parcel in) {
        item1 = in.readString();
        item2 = in.readString();
        price1 = in.readInt();
        price2 = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(item1);
        dest.writeString(item2);
        dest.writeInt(price1);
        dest.writeInt(price2);
    }
}
