·       User should be able to send an email to NDM from the default email.
·       Introduction page should display brief history and goals of the NDM website.

// Generated Spring Boot application with controller, service and repository classes

Controller:

@RestController
public class IntroductionController {

	@Autowired
	private IntroductionService introductionService;

	@GetMapping("/about")
	public ResponseEntity<Introduction> getIntroduction() {
		return ResponseEntity.ok(introductionService.getIntroduction());
	}

	@PostMapping("/contact-us")
	public ResponseEntity<String> sendEmailToNDM(@RequestBody ContactUsRequest request) {
		String response = introductionService.sendEmailToNDM(request);
		return ResponseEntity.ok(response);
	}

}

Service:

@Service
public class IntroductionService {

	@Autowired
	private IntroductionRepository introductionRepository;

	public Introduction getIntroduction() {
		return introductionRepository.getIntroduction();
	}

	public String sendEmailToNDM(ContactUsRequest request) {
		return introductionRepository.sendEmailToNDM(request);
	}

}

Repository:

@Repository
public class IntroductionRepository {

	public Introduction getIntroduction() {
		// Code to get Introduction from the Database
	}

	public String sendEmailToNDM(ContactUsRequest request) {
		// Code to send an email to NDM from the default email
	}

}