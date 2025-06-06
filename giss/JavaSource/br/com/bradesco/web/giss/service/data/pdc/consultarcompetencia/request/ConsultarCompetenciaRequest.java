/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarCompetenciaRequest.java,v 1.1 2018/03/12 11:23:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request;

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
 * Class ConsultarCompetenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/03/12 11:23:59 $
 */
public class ConsultarCompetenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _funcao
     */
    private java.lang.String _funcao;

    /**
     * Field _funcaoBotao
     */
    private java.lang.String _funcaoBotao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarCompetenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request.ConsultarCompetenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'funcao'.
     * 
     * @return String
     * @return the value of field 'funcao'.
     */
    public java.lang.String getFuncao()
    {
        return this._funcao;
    } //-- java.lang.String getFuncao() 

    /**
     * Returns the value of field 'funcaoBotao'.
     * 
     * @return String
     * @return the value of field 'funcaoBotao'.
     */
    public java.lang.String getFuncaoBotao()
    {
        return this._funcaoBotao;
    } //-- java.lang.String getFuncaoBotao() 

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
     * Sets the value of field 'funcao'.
     * 
     * @param funcao the value of field 'funcao'.
     */
    public void setFuncao(java.lang.String funcao)
    {
        this._funcao = funcao;
    } //-- void setFuncao(java.lang.String) 

    /**
     * Sets the value of field 'funcaoBotao'.
     * 
     * @param funcaoBotao the value of field 'funcaoBotao'.
     */
    public void setFuncaoBotao(java.lang.String funcaoBotao)
    {
        this._funcaoBotao = funcaoBotao;
    } //-- void setFuncaoBotao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarCompetenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request.ConsultarCompetenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request.ConsultarCompetenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request.ConsultarCompetenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.request.ConsultarCompetenciaRequest unmarshal(java.io.Reader) 

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
