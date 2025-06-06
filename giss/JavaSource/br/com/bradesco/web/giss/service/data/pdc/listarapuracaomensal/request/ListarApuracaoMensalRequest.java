/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoMensalRequest.java,v 1.2 2018/06/06 17:09:54 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request;

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
 * Class ListarApuracaoMensalRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/06/06 17:09:54 $
 */
public class ListarApuracaoMensalRequest implements java.io.Serializable {


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

    /**
     * Field _diaDe
     */
    private java.lang.String _diaDe;

    /**
     * Field _diaAte
     */
    private java.lang.String _diaAte;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoMensalRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'diaAte'.
     * 
     * @return String
     * @return the value of field 'diaAte'.
     */
    public java.lang.String getDiaAte()
    {
        return this._diaAte;
    } //-- java.lang.String getDiaAte() 

    /**
     * Returns the value of field 'diaDe'.
     * 
     * @return String
     * @return the value of field 'diaDe'.
     */
    public java.lang.String getDiaDe()
    {
        return this._diaDe;
    } //-- java.lang.String getDiaDe() 

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
     * Sets the value of field 'diaAte'.
     * 
     * @param diaAte the value of field 'diaAte'.
     */
    public void setDiaAte(java.lang.String diaAte)
    {
        this._diaAte = diaAte;
    } //-- void setDiaAte(java.lang.String) 

    /**
     * Sets the value of field 'diaDe'.
     * 
     * @param diaDe the value of field 'diaDe'.
     */
    public void setDiaDe(java.lang.String diaDe)
    {
        this._diaDe = diaDe;
    } //-- void setDiaDe(java.lang.String) 

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
     * @return ListarApuracaoMensalRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.request.ListarApuracaoMensalRequest unmarshal(java.io.Reader) 

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
