/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request;

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
 * Class GerarRelatoriosAliquotasRequest.
 * 
 * @version $Revision$ $Date$
 */
public class GerarRelatoriosAliquotasRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codItemLeiComp
     */
    private int _codItemLeiComp = 0;

    /**
     * keeps track of state for field: _codItemLeiComp
     */
    private boolean _has_codItemLeiComp;

    /**
     * Field _dataInicioVigencia
     */
    private int _dataInicioVigencia = 0;

    /**
     * keeps track of state for field: _dataInicioVigencia
     */
    private boolean _has_dataInicioVigencia;

    /**
     * Field _dataFimVigencia
     */
    private int _dataFimVigencia = 0;

    /**
     * keeps track of state for field: _dataFimVigencia
     */
    private boolean _has_dataFimVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarRelatoriosAliquotasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLeiComp
     * 
     */
    public void deleteCodItemLeiComp()
    {
        this._has_codItemLeiComp= false;
    } //-- void deleteCodItemLeiComp() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteDataFimVigencia
     * 
     */
    public void deleteDataFimVigencia()
    {
        this._has_dataFimVigencia= false;
    } //-- void deleteDataFimVigencia() 

    /**
     * Method deleteDataInicioVigencia
     * 
     */
    public void deleteDataInicioVigencia()
    {
        this._has_dataInicioVigencia= false;
    } //-- void deleteDataInicioVigencia() 

    /**
     * Returns the value of field 'codItemLeiComp'.
     * 
     * @return int
     * @return the value of field 'codItemLeiComp'.
     */
    public int getCodItemLeiComp()
    {
        return this._codItemLeiComp;
    } //-- int getCodItemLeiComp() 

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
     * Returns the value of field 'dataFimVigencia'.
     * 
     * @return int
     * @return the value of field 'dataFimVigencia'.
     */
    public int getDataFimVigencia()
    {
        return this._dataFimVigencia;
    } //-- int getDataFimVigencia() 

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return int
     * @return the value of field 'dataInicioVigencia'.
     */
    public int getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- int getDataInicioVigencia() 

    /**
     * Method hasCodItemLeiComp
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLeiComp()
    {
        return this._has_codItemLeiComp;
    } //-- boolean hasCodItemLeiComp() 

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
     * Method hasDataFimVigencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataFimVigencia()
    {
        return this._has_dataFimVigencia;
    } //-- boolean hasDataFimVigencia() 

    /**
     * Method hasDataInicioVigencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataInicioVigencia()
    {
        return this._has_dataInicioVigencia;
    } //-- boolean hasDataInicioVigencia() 

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
     * Sets the value of field 'codItemLeiComp'.
     * 
     * @param codItemLeiComp the value of field 'codItemLeiComp'.
     */
    public void setCodItemLeiComp(int codItemLeiComp)
    {
        this._codItemLeiComp = codItemLeiComp;
        this._has_codItemLeiComp = true;
    } //-- void setCodItemLeiComp(int) 

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
     * Sets the value of field 'dataFimVigencia'.
     * 
     * @param dataFimVigencia the value of field 'dataFimVigencia'.
     */
    public void setDataFimVigencia(int dataFimVigencia)
    {
        this._dataFimVigencia = dataFimVigencia;
        this._has_dataFimVigencia = true;
    } //-- void setDataFimVigencia(int) 

    /**
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(int dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
        this._has_dataInicioVigencia = true;
    } //-- void setDataInicioVigencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarRelatoriosAliquotasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.request.GerarRelatoriosAliquotasRequest unmarshal(java.io.Reader) 

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
