package cn.mingyuan.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartment<M extends BaseDepartment<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("name");
	}

	public M setLeader(java.lang.String leader) {
		set("leader", leader);
		return (M)this;
	}

	public java.lang.String getLeader() {
		return get("leader");
	}

	public M setContacter(java.lang.String contacter) {
		set("contacter", contacter);
		return (M)this;
	}

	public java.lang.String getContacter() {
		return get("contacter");
	}

	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public M setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
		return (M)this;
	}

	public java.lang.String getTelephone() {
		return get("telephone");
	}

	public M setFax(java.lang.String fax) {
		set("fax", fax);
		return (M)this;
	}

	public java.lang.String getFax() {
		return get("fax");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public M setNote(java.lang.String note) {
		set("note", note);
		return (M)this;
	}

	public java.lang.String getNote() {
		return get("note");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setInstId(java.lang.Integer instId) {
		set("inst_id", instId);
		return (M)this;
	}

	public java.lang.Integer getInstId() {
		return get("inst_id");
	}

}
