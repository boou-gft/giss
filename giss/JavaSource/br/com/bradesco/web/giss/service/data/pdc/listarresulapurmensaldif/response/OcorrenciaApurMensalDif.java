/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciaApurMensalDif.java,v 1.1 2017/04/11 14:10:53 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OcorrenciaApurMensalDif.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:53 $
 */
public class OcorrenciaApurMensalDif implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalFaixa
     */
    private java.lang.String _sinalFaixa;

    /**
     * Field _valorFaixa
     */
    private java.math.BigDecimal _valorFaixa = new java.math.BigDecimal("0");

    /**
     * Field _sinalFaixaFinal
     */
    private java.lang.String _sinalFaixaFinal;

    /**
     * Field _valorFaixaFinal
     */
    private java.math.BigDecimal _valorFaixaFinal = new java.math.BigDecimal("0");

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");

    /**
     * Field _sinalRedutor
     */
    private java.lang.String _sinalRedutor;

    /**
     * Field _valorRedutor
     */
    private java.math.BigDecimal _valorRedutor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciaApurMensalDif() 
     {
        super();
        setValorFaixa(new java.math.BigDecimal("0"));
        setValorFaixaFinal(new java.math.BigDecimal("0"));
        setAliquota(new java.math.BigDecimal("0"));
        setValorRedutor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquota'.
     */
    public java.math.BigDecimal getAliquota()
    {
        return this._aliquota;
    } //-- java.math.BigDecimal getAliquota() 

    /**
     * Returns the value of field 'sinalFaixa'.
     * 
     * @return String
     * @return the value of field 'sinalFaixa'.
     */
    public java.lang.String getSinalFaixa()
    {
        return this._sinalFaixa;
    } //-- java.lang.String getSinalFaixa() 

    /**
     * Returns the value of field 'sinalFaixaFinal'.
     * 
     * @return String
     * @return the value of field 'sinalFaixaFinal'.
     */
    public java.lang.String getSinalFaixaFinal()
    {
        return this._sinalFaixaFinal;
    } //-- java.lang.String getSinalFaixaFinal() 

    /**
     * Returns the value of field 'sinalRedutor'.
     * 
     * @return String
     * @return the value of field 'sinalRedutor'.
     */
    public java.lang.String getSinalRedutor()
    {
        return this._sinalRedutor;
    } //-- java.lang.String getSinalRedutor() 

    /**
     * Returns the value of field 'valorFaixa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorFaixa'.
     */
    public java.math.BigDecimal getValorFaixa()
    {
        return this._valorFaixa;
    } //-- java.math.BigDecimal getValorFaixa() 

    /**
     * Returns the value of field 'valorFaixaFinal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorFaixaFinal'.
     */
    public java.math.BigDecimal getValorFaixaFinal()
    {
        return this._valorFaixaFinal;
    } //-- java.math.BigDecimal getValorFaixaFinal() 

    /**
     * Returns the value of field 'valorRedutor'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRedutor'.
     */
    public java.math.BigDecimal getValorRedutor()
    {
        return this._valorRedutor;
    } //-- java.math.BigDecimal getValorRedutor() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(java.math.BigDecimal aliquota)
    {
        this._aliquota = aliquota;
    } //-- void setAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'sinalFaixa'.
     * 
     * @param sinalFaixa the value of field 'sinalFaixa'.
     */
    public void setSinalFaixa(java.lang.String sinalFaixa)
    {
        this._sinalFaixa = sinalFaixa;
    } //-- void setSinalFaixa(java.lang.String) 

    /**
     * Sets the value of field 'sinalFaixaFinal'.
     * 
     * @param sinalFaixaFinal the value of field 'sinalFaixaFinal'.
     */
    public void setSinalFaixaFinal(java.lang.String sinalFaixaFinal)
    {
        this._sinalFaixaFinal = sinalFaixaFinal;
    } //-- void setSinalFaixaFinal(java.lang.String) 

    /**
     * Sets the value of field 'sinalRedutor'.
     * 
     * @param sinalRedutor the value of field 'sinalRedutor'.
     */
    public void setSinalRedutor(java.lang.String sinalRedutor)
    {
        this._sinalRedutor = sinalRedutor;
    } //-- void setSinalRedutor(java.lang.String) 

    /**
     * Sets the value of field 'valorFaixa'.
     * 
     * @param valorFaixa the value of field 'valorFaixa'.
     */
    public void setValorFaixa(java.math.BigDecimal valorFaixa)
    {
        this._valorFaixa = valorFaixa;
    } //-- void setValorFaixa(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorFaixaFinal'.
     * 
     * @param valorFaixaFinal the value of field 'valorFaixaFinal'.
     */
    public void setValorFaixaFinal(java.math.BigDecimal valorFaixaFinal)
    {
        this._valorFaixaFinal = valorFaixaFinal;
    } //-- void setValorFaixaFinal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorRedutor'.
     * 
     * @param valorRedutor the value of field 'valorRedutor'.
     */
    public void setValorRedutor(java.math.BigDecimal valorRedutor)
    {
        this._valorRedutor = valorRedutor;
    } //-- void setValorRedutor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciaApurMensalDif
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.response.OcorrenciaApurMensalDif unmarshal(java.io.Reader) 

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
