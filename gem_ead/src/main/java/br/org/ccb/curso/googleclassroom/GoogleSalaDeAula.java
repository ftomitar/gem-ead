package br.org.ccb.curso.googleclassroom;

import com.google.api.services.classroom.Classroom;
import com.google.api.services.classroom.Classroom.Courses.Create;
import com.google.api.services.classroom.model.Course;

import br.org.ccb.curso.CursoOferecido;
import br.org.ccb.curso.salaDeAula.SalaDeAula;

public class GoogleSalaDeAula {
	private Course salaDeAulaGoogle;

	public boolean criarSalaAula(CursoOferecido cursoOferecido, SalaDeAula sala) {
		Course googleCurse = new Course()
		        .setName(sala.getNomeSalaAula())
		        .setDescriptionHeading(cursoOferecido.getTitulo())
		        .setDescription(cursoOferecido.getDescricao())
		        .setSection(cursoOferecido.getDisciplina())
		        .setOwnerId(cursoOferecido.getResponsavel()) 
		        .setCourseState(cursoOferecido.getStatus()) ;
		try {
			Classroom googleClassroomService = GoogleClassroomEngine.getInstance().getGoogleClassroomService();
			if(googleClassroomService == null) {
				return false;
			}
			 Create createClassroom = googleClassroomService.courses().create(googleCurse);
			 salaDeAulaGoogle = createClassroom.execute();	
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			salaDeAulaGoogle = null;
		}
		
		return false;
	}
	
	public String obterUrlSalaAula() {
		return salaDeAulaGoogle.getAlternateLink();
	}
}
