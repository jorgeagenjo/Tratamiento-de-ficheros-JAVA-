package com.example.XLS_XML.models;

public class employes {
    // Fields
    private String eeid;
    private String fullName;
    private String jobTitle;
    private String department;
    private String businessUnit;
    private String gender;
    private String ethnicity;
    private String age;
    private String hireDate;
    private String annualSalary;
    private String bonusPercentage;
    private String country;
    private String city;
    private String exitDate;

    // Constructor
    public employes(String eeid, String fullName, String jobTitle, String department,
                    String businessUnit, String gender, String ethnicity, String age,
                    String hireDate, String annualSalary, String bonusPercentage,
                    String country, String city, String exitDate) {
        this.eeid = eeid;
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.businessUnit = businessUnit;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.age = age;
        this.hireDate = hireDate;
        this.annualSalary = annualSalary;
        this.bonusPercentage = bonusPercentage;
        this.country = country;
        this.city = city;
        this.exitDate = exitDate;
    }

    public String getEeid() {
        return eeid;
    }

    public void setEeid(String eeid) {
        this.eeid = eeid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(String bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "eeid='" + eeid + '\'' +
                ", fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", age='" + age + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", annualSalary='" + annualSalary + '\'' +
                ", bonusPercentage='" + bonusPercentage + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", exitDate='" + exitDate + '\'' +
                '}';
    }
}

