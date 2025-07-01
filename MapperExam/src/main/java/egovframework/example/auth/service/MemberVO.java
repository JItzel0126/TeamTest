/**
 * 
 */
package egovframework.example.auth.service;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author user
 * VO == 테이블
 *
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO extends Criteria{
	private String email;		// 기본키, 로그인ID
	private String password;	// 암호
	private String name;		// 이름
}
