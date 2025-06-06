/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      /**
	 * 
	 */
	private static final long serialVersionUID = -7666986627525789263L;

	//--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _uf
     */
    private java.lang.String _uf;

    /**
     * Field _codigoItemServico
     */
    private int _codigoItemServico = 0;

    /**
     * keeps track of state for field: _codigoItemServico
     */
    private boolean _has_codigoItemServico;

    /**
     * Field _nomeItemServico
     */
    private java.lang.String _nomeItemServico;

    /**
     * Field _aliquotaAtual
     */
    private java.math.BigDecimal _aliquotaAtual = new java.math.BigDecimal("0");

    /**
     * Field _aliquotaIssProprio
     */
    private java.math.BigDecimal _aliquotaIssProprio = new java.math.BigDecimal("0");

    /**
     * Field _aliquotaIssGerencial
     */
    private java.math.BigDecimal _aliquotaIssGerencial = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
        setAliquotaAtual(new java.math.BigDecimal("0"));
        setAliquotaIssProprio(new java.math.BigDecimal("0"));
        setAliquotaIssGerencial(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoItemServico
     * 
     */
    public void deleteCodigoItemServico()
    {
        this._has_codigoItemServico= false;
    } //-- void deleteCodigoItemServico() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'aliquotaAtual'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaAtual'.
     */
    public java.math.BigDecimal getAliquotaAtual()
    {
        return this._aliquotaAtual;
    } //-- java.math.BigDecimal getAliquotaAtual() 

    /**
     * Returns the value of field 'aliquotaIssGerencial'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaIssGerencial'.
     */
    public java.math.BigDecimal getAliquotaIssGerencial()
    {
        return this._aliquotaIssGerencial;
    } //-- java.math.BigDecimal getAliquotaIssGerencial() 

    /**
     * Returns the value of field 'aliquotaIssProprio'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaIssProprio'.
     */
    public java.math.BigDecimal getAliquotaIssProprio()
    {
        return this._aliquotaIssProprio;
    } //-- java.math.BigDecimal getAliquotaIssProprio() 

    /**
     * Returns the value of field 'codigoItemServico'.
     * 
     * @return int
     * @return the value of field 'codigoItemServico'.
     */
    public int getCodigoItemServico()
    {
        return this._codigoItemServico;
    } //-- int getCodigoItemServico() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'nomeItemServico'.
     * 
     * @return String
     * @return the value of field 'nomeItemServico'.
     */
    public java.lang.String getNomeItemServico()
    {
        return this._nomeItemServico;
    } //-- java.lang.String getNomeItemServico() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

    /**
     * Returns the value of field 'uf'.
     * 
     * @return String
     * @return the value of field 'uf'.
     */
    public java.lang.String getUf()
    {
        return this._uf;
    } //-- java.lang.String getUf() 

    /**
     * Method hasCodigoItemServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoItemServico()
    {
        return this._has_codigoItemServico;
    } //-- boolean hasCodigoItemServico() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'aliquotaAtual'.
     * 
     * @param aliquotaAtual the value of field 'aliquotaAtual'.
     */
    public void setAliquotaAtual(java.math.BigDecimal aliquotaAtual)
    {
        this._aliquotaAtual = aliquotaAtual;
    } //-- void setAliquotaAtual(java.math.BigDecimal) 

    /**
     * Sets the value of field 'aliquotaIssGerencial'.
     * 
     * @param aliquotaIssGerencial the value of field
     * 'aliquotaIssGerencial'.
     */
    public void setAliquotaIssGerencial(java.math.BigDecimal aliquotaIssGerencial)
    {
        this._aliquotaIssGerencial = aliquotaIssGerencial;
    } //-- void setAliquotaIssGerencial(java.math.BigDecimal) 

    /**
     * Sets the value of field 'aliquotaIssProprio'.
     * 
     * @param aliquotaIssProprio the value of field
     * 'aliquotaIssProprio'.
     */
    public void setAliquotaIssProprio(java.math.BigDecimal aliquotaIssProprio)
    {
        this._aliquotaIssProprio = aliquotaIssProprio;
    } //-- void setAliquotaIssProprio(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codigoItemServico'.
     * 
     * @param codigoItemServico the value of field
     * 'codigoItemServico'.
     */
    public void setCodigoItemServico(int codigoItemServico)
    {
        this._codigoItemServico = codigoItemServico;
        this._has_codigoItemServico = true;
    } //-- void setCodigoItemServico(int) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'nomeItemServico'.
     * 
     * @param nomeItemServico the value of field 'nomeItemServico'.
     */
    public void setNomeItemServico(java.lang.String nomeItemServico)
    {
        this._nomeItemServico = nomeItemServico;
    } //-- void setNomeItemServico(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'uf'.
     * 
     * @param uf the value of field 'uf'.
     */
    public void setUf(java.lang.String uf)
    {
        this._uf = uf;
    } //-- void setUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.response.Lista unmarshal(java.io.Reader) 

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
