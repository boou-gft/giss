/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaDepenPlanApuracaoNvConta.java,v 1.1 2018/06/14 10:16:04 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request;

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
 * Class ListaDepenPlanApuracaoNvConta.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/06/14 10:16:04 $
 */
public class ListaDepenPlanApuracaoNvConta implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _competencia
     */
    private java.lang.String _competencia;

    /**
     * Field _numSeqUnidOrganiz
     */
    private int _numSeqUnidOrganiz = 0;

    /**
     * keeps track of state for field: _numSeqUnidOrganiz
     */
    private boolean _has_numSeqUnidOrganiz;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaDepenPlanApuracaoNvConta() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumSeqUnidOrganiz
     * 
     */
    public void deleteNumSeqUnidOrganiz()
    {
        this._has_numSeqUnidOrganiz= false;
    } //-- void deleteNumSeqUnidOrganiz() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return String
     * @return the value of field 'competencia'.
     */
    public java.lang.String getCompetencia()
    {
        return this._competencia;
    } //-- java.lang.String getCompetencia() 

    /**
     * Returns the value of field 'numSeqUnidOrganiz'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidOrganiz'.
     */
    public int getNumSeqUnidOrganiz()
    {
        return this._numSeqUnidOrganiz;
    } //-- int getNumSeqUnidOrganiz() 

    /**
     * Method hasNumSeqUnidOrganiz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidOrganiz()
    {
        return this._has_numSeqUnidOrganiz;
    } //-- boolean hasNumSeqUnidOrganiz() 

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
    public void setCompetencia(java.lang.String competencia)
    {
        this._competencia = competencia;
    } //-- void setCompetencia(java.lang.String) 

    /**
     * Sets the value of field 'numSeqUnidOrganiz'.
     * 
     * @param numSeqUnidOrganiz the value of field
     * 'numSeqUnidOrganiz'.
     */
    public void setNumSeqUnidOrganiz(int numSeqUnidOrganiz)
    {
        this._numSeqUnidOrganiz = numSeqUnidOrganiz;
        this._has_numSeqUnidOrganiz = true;
    } //-- void setNumSeqUnidOrganiz(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaDepenPlanApuracaoNvConta
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.request.ListaDepenPlanApuracaoNvConta unmarshal(java.io.Reader) 

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
