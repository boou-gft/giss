/**
 * 
 */
package br.com.bradesco.web.giss.view.bean;

import java.util.ArrayList;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.log.config.BradescoLogChangeConfigImpl;
import br.com.bradesco.web.aq.application.log.config.IBradescoLogChangeConfig;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;

/**
 * @author arquitetura.gft
 *
 */
public class LogBean {
	private ILogManager log = BradescoCommonServiceFactory.getLogManager();
	private IBradescoLogChangeConfig logger = new BradescoLogChangeConfigImpl();
	private String applicationLevel;
	private String updateLevel;
	private String updateCategory;
	private String showCategory;
	private String enableCategory;
	private String disableCategory;
	private String filterName;
	private String filterParams;
	private String business;
	private ArrayList categories = new ArrayList(0);
	private String showLevel;
	
	public LogBean() {
		applicationLevel = logger.showApplicationLevel();
	}

	/**
	 * @return Returns the logger.
	 */
	public IBradescoLogChangeConfig getLogger() {
		return logger;
	}

	/**
	 * @param logger The logger to set.
	 */
	public void setLogger(IBradescoLogChangeConfig logger) {
		this.logger = logger;
	}

	/**
	 * @return Returns the applicationLevel.
	 */
	public String getApplicationLevel() {
		return applicationLevel;
	}

	/**
	 * @param applicationLevel The applicationLevel to set.
	 */
	public void setApplicationLevel(String applicationLevel) {
		this.applicationLevel = applicationLevel;
	}

	/**
	 * @return Returns the disableCategory.
	 */
	public String getDisableCategory() {
		return disableCategory;
	}

	/**
	 * @param disableCategory The disableCategory to set.
	 */
	public void setDisableCategory(String disableCategory) {
		this.disableCategory = disableCategory;
	}

	/**
	 * @return Returns the enableCategory.
	 */
	public String getEnableCategory() {
		return enableCategory;
	}

	/**
	 * @param enableCategory The enableCategory to set.
	 */
	public void setEnableCategory(String enableCategory) {
		this.enableCategory = enableCategory;
	}

	/**
	 * @return Returns the filterName.
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * @param filterName The filterName to set.
	 */
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	/**
	 * @return Returns the filterParams.
	 */
	public String getFilterParams() {
		return filterParams;
	}

	/**
	 * @param filterParams The filterParams to set.
	 */
	public void setFilterParams(String filterParams) {
		this.filterParams = filterParams;
	}

	/**
	 * @return Returns the showCategory.
	 */
	public String getShowCategory() {
		return showCategory;
	}

	/**
	 * @param showCategory The showCategory to set.
	 */
	public void setShowCategory(String showCategory) {
		this.showCategory = showCategory;
	}

	/**
	 * @return Returns the updateCategory.
	 */
	public String getUpdateCategory() {
		return updateCategory;
	}

	/**
	 * @param updateCategory The updateCategory to set.
	 */
	public void setUpdateCategory(String updateCategory) {
		this.updateCategory = updateCategory;
	}

	/**
	 * @return Returns the updateLevel.
	 */
	public String getUpdateLevel() {
		return updateLevel;
	}

	/**
	 * @param updateLevel The updateLevel to set.
	 */
	public void setUpdateLevel(String updateLevel) {
		this.updateLevel = updateLevel;
	}
	
	/**
	 * @return Returns the business.
	 */	
	public String getBusiness() {
		return business;
	}

	/**
	 * @param business The updateLevel to business.
	 */
	public void setBusiness(String business) {
		this.business = business;
	}

	/**
	 * 
	 * @param event
	 * @throws AbortProcessingException
	 */
	public void atualizarLog(ActionEvent event) throws AbortProcessingException {
		log.debug(this, "Testando Log... início método atualizarLog");
		//Atualiza Level por Categoria
		if((updateCategory != null && !updateCategory.trim().equals("")) && 
				(updateLevel != null && !updateLevel.trim().equals(""))) {
			logger.updateLevelForCategory(updateCategory, updateLevel);
			log.debug(this, "Executando método updateLevelForCategory");
		}
		//Atualiza Level da Aplicação
		if(applicationLevel != null && !applicationLevel.trim().equals("")) {
			logger.updateApplicationLevel(applicationLevel);
			log.debug(this, "Executando método updateApplicationLevel");
		}
		//Mostra o level
		if(showCategory != null && !showCategory.trim().equals("")) {
			showLevel = logger.showLevelForCategory(showCategory);
			log.debug(this, "Executando método showLevelForCategory");
		} else {
			showLevel = "";
		}
		
		//Coloca a categoria em modo debug
		if((enableCategory != null && !enableCategory.trim().equals("")) &&
				(filterName != null && !filterName.trim().equals("")) &&
				(filterParams != null && !filterParams.trim().equals(""))) {
			logger.enableFilterForCategory(enableCategory, filterName, filterParams);
			log.debug(this, "Executando método enableFilterForCategory");
		}
		//Remove o filtro da categoria
		if(disableCategory != null && !disableCategory.trim().equals("")) {
			logger.disableFilterForCategory(disableCategory);
			log.debug(this, "Executando método disableFilterForCategory");
		}
		//Gera log de negócio
		if(business != null && !business.trim().equals("")) {
			log.business(business);
			log.debug(this, "Executando método disableFilterForCategory");
		}
		log.debug(this, "Testando Log... final do método atualizarLog");
	}

	/**
	 * @return Returns the categories.
	 */
	public ArrayList getCategories() {
		categories.clear();
		categories.add(new SelectItem("", ""));
		String[] categorias = logger.showCurrentFilteredCategories().split(",");
		for(int i = 0; i < categorias.length; i++) {
			SelectItem selectItem = new SelectItem(categorias[i].trim(), categorias[i].trim());
			categories.add(selectItem);
		}
		return categories;
	}

	/**
	 * @param categories The categories to set.
	 */
	public void setCategories(ArrayList categories) {
		this.categories = categories;
	}

	/**
	 * @return Returns the showLevel.
	 */
	public String getShowLevel() {
		return showLevel;
	}

	/**
	 * @param showLevel The showLevel to set.
	 */
	public void setShowLevel(String showLevel) {
		this.showLevel = showLevel;
	}
}
