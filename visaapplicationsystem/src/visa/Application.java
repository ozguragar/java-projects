package visa;

public class Application {
	
	private Applicant applicant;
	private VisaType visaType;
	private String status;
	private int duration;
	
	public Application(Applicant applicant, VisaType visaType, int duration) {
		this.applicant = applicant;
		this.visaType = visaType;
		this.duration = duration;
		status = "beklemede";
	}
	
	public void approveApplication() {
		if (visaType.getType( )== "Turist" && duration > visaType.getMaxStayDuration()) {
			this.status = "Turist Vizesi Reddedildi";
		}
		else if (visaType.getType( )== "Çalışma" && applicant.isHasWorkPermit() != visaType.isRequiresWorkPermit()) {
			this.status = "Çalışma Vizesi Reddedildi";
		}
		else{
			this.status = "Onaylandı";
		}
	}
	
	public void applicationInfo() {
		System.out.println("Başvuru Sahibi: " + applicant.getName());
		System.out.println("Pasaport Numarası: " + applicant.getPassportNumber());
		System.out.print("Çalışma İzni: ");
		if(applicant.isHasWorkPermit() == true) {
			System.out.println("Var");
		}
		else {
			System.out.println("Yok");
		}
		System.out.print("Başvurulan Vize Türü: ");
		if(visaType.getType() == "Turist") {
			System.out.println("Turist");
		}
		else {
			System.out.println("Çalışma");
		}
		System.out.println("Durum: " + this.getStatus());
		if(this.getStatus() == "Onaylandı") {
			System.out.print("Onaylanan Kalış Süresi: ");
			System.out.println(duration + " gün");
		} else{
			System.out.print("Reddetme Nedeni: ");

			 if(duration > visaType.getMaxStayDuration()) {
				 System.out.println(visaType.getType() + " vizesi için maksimum kalış süresi aşıldı");
			 }
			 else {
				 System.out.println("Çalışma izni yok");
			 }
		}
		System.out.println("-------------------------");
		System.out.println();

	}

	private String getStatus() {
		return status;
	}
	
}
