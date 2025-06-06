/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaAlterarAliquota.java,v 1.2 2017/12/07 13:39:24 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaAlterarAliquota.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/07 13:39:24 $
 */
public class ListaAlterarAliquota implements java.io.Serializable {


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
     * Field _codItemCompl
     */
    private int _codItemCompl = 0;

    /**
     * keeps track of state for field: _codItemCompl
     */
    private boolean _has_codItemCompl;

    /**
     * Field _aliquotaApurcMinicipio
     */
    private java.math.BigDecimal _aliquotaApurcMinicipio = new java.math.BigDecimal("0");

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaAlterarAliquota() 
     {
        super();
        setAliquotaApurcMinicipio(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemCompl
     * 
     */
    public void deleteCodItemCompl()
    {
        this._has_codItemCompl= false;
    } //-- void deleteCodItemCompl() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Returns the value of field 'aliquotaApurcMinicipio'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaApurcMinicipio'.
     */
    public java.math.BigDecimal getAliquotaApurcMinicipio()
    {
        return this._aliquotaApurcMinicipio;
    } //-- java.math.BigDecimal getAliquotaApurcMinicipio() 

    /**
     * Returns the value of field 'codItemCompl'.
     * 
     * @return int
     * @return the value of field 'codItemCompl'.
     */
    public int getCodItemCompl()
    {
        return this._codItemCompl;
    } //-- int getCodItemCompl() 

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
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Method hasCodItemCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemCompl()
    {
        return this._has_codItemCompl;
    } //-- boolean hasCodItemCompl() 

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
     * Sets the value of field 'aliquotaApurcMinicipio'.
     * 
     * @param aliquotaApurcMinicipio the value of field
     * 'aliquotaApurcMinicipio'.
     */
    public void setAliquotaApurcMinicipio(java.math.BigDecimal aliquotaApurcMinicipio)
    {
        this._aliquotaApurcMinicipio = aliquotaApurcMinicipio;
    } //-- void setAliquotaApurcMinicipio(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codItemCompl'.
     * 
     * @param codItemCompl the value of field 'codItemCompl'.
     */
    public void setCodItemCompl(int codItemCompl)
    {
        this._codItemCompl = codItemCompl;
        this._has_codItemCompl = true;
    } //-- void setCodItemCompl(int) 

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
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaAlterarAliquota
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.request.ListaAlterarAliquota unmarshal(java.io.Reader) 

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
