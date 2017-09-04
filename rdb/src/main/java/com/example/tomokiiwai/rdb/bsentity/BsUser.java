package com.example.tomokiiwai.rdb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.example.tomokiiwai.rdb.allcommon.DBMetaInstanceHandler;
import com.example.tomokiiwai.rdb.exentity.*;

/**
 * The entity of user as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, name, password
 *
 * [sequence]
 *     
 *
 * [identity]
 *     id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String name = entity.getName();
 * String password = entity.getPassword();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setPassword(password);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** name: {NotNull, VARCHAR(255)} */
    protected String _name;

    /** password: {NotNull, VARCHAR(255)} */
    protected String _password;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_password));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(255)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] password: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'password'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {NotNull, VARCHAR(255)} <br>
     * @param password The value of the column 'password'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }
}
