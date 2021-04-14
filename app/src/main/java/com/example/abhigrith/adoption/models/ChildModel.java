package com.example.abhigrith.adoption.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ChildModel implements Parcelable {

    private String childDateOfBirth;
    private String childFullName;
    private String childGender;
    private String childId;
    private String childImageUrl;

    // Empty Constructor for firebase
    public ChildModel() {

    }

    public ChildModel(String childDateOfBirth, String childFullName, String childGender, String childId, String childImageUrl) {
        this.childDateOfBirth = childDateOfBirth;
        this.childFullName = childFullName;
        this.childGender = childGender;
        this.childId = childId;
        this.childImageUrl = childImageUrl;
    }

    protected ChildModel(Parcel in) {
        childDateOfBirth = in.readString();
        childFullName = in.readString();
        childGender = in.readString();
        childId = in.readString();
        childImageUrl = in.readString();
    }

    public static final Creator<ChildModel> CREATOR = new Creator<ChildModel>() {
        @Override
        public ChildModel createFromParcel(Parcel in) {
            return new ChildModel(in);
        }

        @Override
        public ChildModel[] newArray(int size) {
            return new ChildModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(childDateOfBirth);
        dest.writeString(childFullName);
        dest.writeString(childGender);
        dest.writeString(childId);
        dest.writeString(childImageUrl);
    }

    @Override
    public String toString() {
        return "ChildModel{" +
                "childDateOfBirth='" + childDateOfBirth + '\'' +
                ", childFullName='" + childFullName + '\'' +
                ", childGender='" + childGender + '\'' +
                ", childId='" + childId + '\'' +
                ", childImageUrl='" + childImageUrl + '\'' +
                '}';
    }

    public String getChildDateOfBirth() {
        return childDateOfBirth;
    }

    public void setChildDateOfBirth(String childDateOfBirth) {
        this.childDateOfBirth = childDateOfBirth;
    }

    public String getChildFullName() {
        return childFullName;
    }

    public void setChildFullName(String childFullName) {
        this.childFullName = childFullName;
    }

    public String getChildGender() {
        return childGender;
    }

    public void setChildGender(String childGender) {
        this.childGender = childGender;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getChildImageUrl() {
        return childImageUrl;
    }

    public void setChildImageUrl(String childImageUrl) {
        this.childImageUrl = childImageUrl;
    }
}
