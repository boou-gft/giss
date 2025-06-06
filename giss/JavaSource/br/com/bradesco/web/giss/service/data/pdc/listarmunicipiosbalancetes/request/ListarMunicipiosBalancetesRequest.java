/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMunicipiosBalancetesRequest.java,v 1.1 2017/04/11 14:12:01 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request;

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
 * Class ListarMunicipiosBalancetesRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:01 $
 */
public class ListarMunicipiosBalancetesRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeMaxOcorrencias
     */
    private int _qtdeMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeMaxOcorrencias
     */
    private boolean _has_qtdeMaxOcorrencias;

    /**
     * Field _codUf
     */
    private int _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipiosBalancetesRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Method deleteQtdeMaxOcorrencias
     * 
     */
    public void deleteQtdeMaxOcorrencias()
    {
        this._has_qtdeMaxOcorrencias= false;
    } //-- void deleteQtdeMaxOcorrencias() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUf'.
     * 
     * @return int
     * @return the value of field 'codUf'.
     */
    public int getCodUf()
    {
        return this._codUf;
    } //-- int getCodUf() 

    /**
     * Returns the value of field 'qtdeMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeMaxOcorrencias'.
     */
    public int getQtdeMaxOcorrencias()
    {
        return this._qtdeMaxOcorrencias;
    } //-- int getQtdeMaxOcorrencias() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUf()
    {
        return this._has_codUf;
    } //-- boolean hasCodUf() 

    /**
     * Method hasQtdeMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeMaxOcorrencias()
    {
        return this._has_qtdeMaxOcorrencias;
    } //-- boolean hasQtdeMaxOcorrencias() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(int codUf)
    {
        this._codUf = codUf;
        this._has_codUf = true;
    } //-- void setCodUf(int) 

    /**
     * Sets the value of field 'qtdeMaxOcorrencias'.
     * 
     * @param qtdeMaxOcorrencias the value of field
     * 'qtdeMaxOcorrencias'.
     */
    public void setQtdeMaxOcorrencias(int qtdeMaxOcorrencias)
    {
        this._qtdeMaxOcorrencias = qtdeMaxOcorrencias;
        this._has_qtdeMaxOcorrencias = true;
    } //-- void setQtdeMaxOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarMunicipiosBalancetesRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.request.ListarMunicipiosBalancetesRequest unmarshal(java.io.Reader) 

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
