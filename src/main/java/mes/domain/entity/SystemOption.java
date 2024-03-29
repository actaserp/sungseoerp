package mes.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sys_option")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class SystemOption extends AbstractAuditModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name = "\"Code\"")
	String code;
	
	@Column(name = "\"Value\"")
	String value;	

	@Column(name = "\"Description\"")
	String decription;	
}
