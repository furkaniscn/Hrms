package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.ExperienceForCV;
import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;
import kodlamaio.hrms.entities.concretes.ImageForCV;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.LinkForCV;
import kodlamaio.hrms.entities.concretes.ProgrammingSkillForCV;
import kodlamaio.hrms.entities.concretes.SchoolForCV;

public class JobseekerCVDto {

	public Jobseeker jobseeker;
	public List<ForeignLanguageForCV> languages;
	public List<LinkForCV> links;
	public List<ProgrammingSkillForCV> programingSkills;
	public List<ExperienceForCV> experiences;
	public List<SchoolForCV> schools;
	public ImageForCV image;
}