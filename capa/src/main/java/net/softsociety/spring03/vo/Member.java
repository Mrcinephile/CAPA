package net.softsociety.spring03.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements UserDetails {

	private static final long serialVersionUID = -2115632682956880197L;
	String memberid;
	String memberpw;
	String familyname;
	String firstname;
	String hirafamilyname;
	String hirafirstname;
	String email;
	String phone;
	String address;
	boolean enabled;
	String rolename;
	
	// UserDetails의 메소드 구현해줘야 해서 override
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return this.getMemberpw();
		}
		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return this.getMemberid();
		}
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}
		// 추가
		@Override
		public boolean isEnabled() {
			return enabled;
		}
}
