package cn.mingyuan.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePermission<M extends BasePermission<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setFrame(java.lang.String frame) {
		set("frame", frame);
		return (M)this;
	}

	public java.lang.String getFrame() {
		return get("frame");
	}

	public M setDepId(java.lang.Integer depId) {
		set("dep_id", depId);
		return (M)this;
	}

	public java.lang.Integer getDepId() {
		return get("dep_id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public M setInstId(java.lang.Integer instId) {
		set("inst_id", instId);
		return (M)this;
	}

	public java.lang.Integer getInstId() {
		return get("inst_id");
	}

}
