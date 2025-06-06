/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirApuracaoAjusteRequest.java,v 1.1 2017/09/19 18:34:46 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class IncluirApuracaoAjusteRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/09/19 18:34:46 $
 */
public class IncluirApuracaoAjusteRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;

    /**
     * Field _valorAjuste
     */
    private java.lang.String _valorAjuste = "0";

    /**
     * Field _justificativa
     */
    private java.lang.String _justificativa;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirApuracaoAjusteRequest() 
     {
        super();
        setValorAjuste("0");
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Returns the value of field 'justificativa'.
     * 
     * @return String
     * @return the value of field 'justificativa'.
     */
    public java.lang.String getJustificativa()
    {
        return this._justificativa;
    } //-- java.lang.String getJustificativa() 

    /**
     * Returns the value of field 'valorAjuste'.
     * 
     * @return String
     * @return the value of field 'valorAjuste'.
     */
    public java.lang.String getValorAjuste()
    {
        return this._valorAjuste;
    } //-- java.lang.String getValorAjuste() 

    /**
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Sets the value of field 'justificativa'.
     * 
     * @param justificativa the value of field 'justificativa'.
     */
    public void setJustificativa(java.lang.String justificativa)
    {
        this._justificativa = justificativa;
    } //-- void setJustificativa(java.lang.String) 

    /**
     * Sets the value of field 'valorAjuste'.
     * 
     * @param valorAjuste the value of field 'valorAjuste'.
     */
    public void setValorAjuste(java.lang.String valorAjuste)
    {
        this._valorAjuste = valorAjuste;
    } //-- void setValorAjuste(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirApuracaoAjusteRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.request.IncluirApuracaoAjusteRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
