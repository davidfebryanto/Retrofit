
package com.example.david.testing.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Models {

    @SerializedName("admin")
    @Expose
    private Admin admin;

    /**
     * 
     * @return
     *     The admin
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

}
