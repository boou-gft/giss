/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request;

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
 * Class ConsultarArquivoEmpRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarArquivoEmpRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorrencia
     */
    private int _maxOcorrencia = 0;

    /**
     * keeps track of state for field: _maxOcorrencia
     */
    private boolean _has_maxOcorrencia;

    /**
     * Field _indicadorTela
     */
    private java.lang.String _indicadorTela;

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _anoMes
     */
    private int _anoMes = 0;

    /**
     * keeps track of state for field: _anoMes
     */
    private boolean _has_anoMes;

    /**
     * Field _codProduto
     */
    private int _codProduto = 0;

    /**
     * keeps track of state for field: _codProduto
     */
    private boolean _has_codProduto;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarArquivoEmpRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMes
     * 
     */
    public void deleteAnoMes()
    {
        this._has_anoMes= false;
    } //-- void deleteAnoMes() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodProduto
     * 
     */
    public void deleteCodProduto()
    {
        this._has_codProduto= false;
    } //-- void deleteCodProduto() 

    /**
     * Method deleteMaxOcorrencia
     * 
     */
    public void deleteMaxOcorrencia()
    {
        this._has_maxOcorrencia= false;
    } //-- void deleteMaxOcorrencia() 

    /**
     * Returns the value of field 'anoMes'.
     * 
     * @return int
     * @return the value of field 'anoMes'.
     */
    public int getAnoMes()
    {
        return this._anoMes;
    } //-- int getAnoMes() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codProduto'.
     * 
     * @return int
     * @return the value of field 'codProduto'.
     */
    public int getCodProduto()
    {
        return this._codProduto;
    } //-- int getCodProduto() 

    /**
     * Returns the value of field 'indicadorTela'.
     * 
     * @return String
     * @return the value of field 'indicadorTela'.
     */
    public java.lang.String getIndicadorTela()
    {
        return this._indicadorTela;
    } //-- java.lang.String getIndicadorTela() 

    /**
     * Returns the value of field 'maxOcorrencia'.
     * 
     * @return int
     * @return the value of field 'maxOcorrencia'.
     */
    public int getMaxOcorrencia()
    {
        return this._maxOcorrencia;
    } //-- int getMaxOcorrencia() 

    /**
     * Method hasAnoMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMes()
    {
        return this._has_anoMes;
    } //-- boolean hasAnoMes() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasCodProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodProduto()
    {
        return this._has_codProduto;
    } //-- boolean hasCodProduto() 

    /**
     * Method hasMaxOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorrencia()
    {
        return this._has_maxOcorrencia;
    } //-- boolean hasMaxOcorrencia() 

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
     * Sets the value of field 'anoMes'.
     * 
     * @param anoMes the value of field 'anoMes'.
     */
    public void setAnoMes(int anoMes)
    {
        this._anoMes = anoMes;
        this._has_anoMes = true;
    } //-- void setAnoMes(int) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codProduto'.
     * 
     * @param codProduto the value of field 'codProduto'.
     */
    public void setCodProduto(int codProduto)
    {
        this._codProduto = codProduto;
        this._has_codProduto = true;
    } //-- void setCodProduto(int) 

    /**
     * Sets the value of field 'indicadorTela'.
     * 
     * @param indicadorTela the value of field 'indicadorTela'.
     */
    public void setIndicadorTela(java.lang.String indicadorTela)
    {
        this._indicadorTela = indicadorTela;
    } //-- void setIndicadorTela(java.lang.String) 

    /**
     * Sets the value of field 'maxOcorrencia'.
     * 
     * @param maxOcorrencia the value of field 'maxOcorrencia'.
     */
    public void setMaxOcorrencia(int maxOcorrencia)
    {
        this._maxOcorrencia = maxOcorrencia;
        this._has_maxOcorrencia = true;
    } //-- void setMaxOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarArquivoEmpRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.request.ConsultarArquivoEmpRequest unmarshal(java.io.Reader) 

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
