package tw.com.business_meet.vo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "friend_customization", schema = "dbo", catalog = "BeMet")
public class FriendCustomization {
    private Integer friendCustomizationNo;
    private String name;
    private Integer friendNo;
    private String userId;
    private Date createDate;
    private Date modifyDate;
    private Friend friendByFriendNo;
    private UserInformation userInformationByUserId;
    private Collection<FriendLabel> friendLabelsByFriendCustomizationNo;
    private Collection<FriendRemark> friendRemarksByFriendCustomizationNo;

    @Id
    @Column(name = "friend_customization_no")
    public Integer getFriendCustomizationNo() {
        return friendCustomizationNo;
    }

    public void setFriendCustomizationNo(Integer friendCustomizationNo) {
        this.friendCustomizationNo = friendCustomizationNo;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "friend_no")
    public Integer getFriendNo() {
        return friendNo;
    }

    public void setFriendNo(Integer friendNo) {
        this.friendNo = friendNo;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FriendCustomization that = (FriendCustomization) o;

        if (friendCustomizationNo != null ? !friendCustomizationNo.equals(that.friendCustomizationNo) : that.friendCustomizationNo != null) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (friendNo != null ? !friendNo.equals(that.friendNo) : that.friendNo != null) {
            return false;
        }
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) {
            return false;
        }
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) {
            return false;
        }
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = friendCustomizationNo != null ? friendCustomizationNo.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (friendNo != null ? friendNo.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "friend_no", referencedColumnName = "friend_no", nullable = false, insertable = false, updatable = false)
    public Friend getFriendByFriendNo() {
        return friendByFriendNo;
    }

    public void setFriendByFriendNo(Friend friendByFriendNo) {
        this.friendByFriendNo = friendByFriendNo;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    public UserInformation getUserInformationByUserId() {
        return userInformationByUserId;
    }

    public void setUserInformationByUserId(UserInformation userInformationByUserId) {
        this.userInformationByUserId = userInformationByUserId;
    }

    @OneToMany(mappedBy = "friendCustomizationByFriendCustomizationNo")
    public Collection<FriendLabel> getFriendLabelsByFriendCustomizationNo() {
        return friendLabelsByFriendCustomizationNo;
    }

    public void setFriendLabelsByFriendCustomizationNo(Collection<FriendLabel> friendLabelsByFriendCustomizationNo) {
        this.friendLabelsByFriendCustomizationNo = friendLabelsByFriendCustomizationNo;
    }

    @OneToMany(mappedBy = "friendCustomizationByFriendCustomizationNo")
    public Collection<FriendRemark> getFriendRemarksByFriendCustomizationNo() {
        return friendRemarksByFriendCustomizationNo;
    }

    public void setFriendRemarksByFriendCustomizationNo(Collection<FriendRemark> friendRemarksByFriendCustomizationNo) {
        this.friendRemarksByFriendCustomizationNo = friendRemarksByFriendCustomizationNo;
    }
}