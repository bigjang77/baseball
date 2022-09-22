package site.metacoding.red.domain.teams;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Teams {
	private Integer id;
	private String teamName;
	private Integer stadiumId;
	private String location;
	private Timestamp createDate;
}
