package developia.az.Swagger;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Movie Request Dto",description = "melumatlarin qebul eden dto")
public class SwaggerDto {
	private Integer id;
	private String title;
	private String genre;
	private Integer rating;
	private Integer userId;

}