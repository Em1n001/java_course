package developia.az.Swagger


@RestController
@RequestMapping(path = "/books")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "book Controller",description = "book apileri")
public class BookController<MovieService, MovieRequestDto, MovieResponse, bookResponse> {

	@Autowired
	private MovieService bookService;

	@GetMapping
	public String getbook() {
		return "get book";
	}

	@PostMapping(path = "/add")
	@PreAuthorize("hasAuthority('ROLE_ADD_MOVIE')")
	public void create(@RequestBody MovieRequestDto dto) {
		bookService.add(dto);
	}

	@GetMapping(path = "/getAll")
	
	@Operation(
			description = "Get api for book",
			summary = "This is a summary for book get api"
			)
	public bookResponse getAll() {
		return bookService.get();
	}

	@GetMapping(path = "/title")
	public List<String> getMovieTitles() {
		return bookService.getbookTitle();
	}

	@DeleteMapping(path = "/{id}")
	public void deleteMovie(@PathVariable Integer id) {
		bookService.delete(id);
	}

}