/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirDependenciasNovasRequest.java,v 1.1 2017/04/11 14:12:20 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class IncluirDependenciasNovasRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:20 $
 */
public class IncluirDependenciasNovasRequest implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequencialUnidadeOrganizacional
     */
    private int _numeroSequencialUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialUnidadeOrganizacional
     */
    private boolean _has_numeroSequencialUnidadeOrganizacional;

    /**
     * Field _indicadorTributavel
     */
    private int _indicadorTributavel = 0;

    /**
     * keeps track of state for field: _indicadorTributavel
     */
    private boolean _has_indicadorTributavel;

    /**
     * Field _codigoCCM
     */
    private long _codigoCCM = 0;

    /**
     * keeps track of state for field: _codigoCCM
     */
    private boolean _has_codigoCCM;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoPessoaIncorporadoraDepto
     */
    private long _codigoPessoaIncorporadoraDepto = 0;

    /**
     * keeps track of state for field:
     * _codigoPessoaIncorporadoraDepto
     */
    private boolean _has_codigoPessoaIncorporadoraDepto;

    /**
     * Field _numeroSequencialIncorporadoraDepto
     */
    private int _numeroSequencialIncorporadoraDepto = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialIncorporadoraDepto
     */
    private boolean _has_numeroSequencialIncorporadoraDepto;

    /**
     * Field _inscricaoMunicipal
     */
    private java.lang.String _inscricaoMunicipal;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirDependenciasNovasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoCCM
     * 
     */
    public void deleteCodigoCCM()
    {
        this._has_codigoCCM= false;
    } //-- void deleteCodigoCCM() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaIncorporadoraDepto
     * 
     */
    public void deleteCodigoPessoaIncorporadoraDepto()
    {
        this._has_codigoPessoaIncorporadoraDepto= false;
    } //-- void deleteCodigoPessoaIncorporadoraDepto() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteIndicadorTributavel
     * 
     */
    public void deleteIndicadorTributavel()
    {
        this._has_indicadorTributavel= false;
    } //-- void deleteIndicadorTributavel() 

    /**
     * Method deleteNumeroSequencialIncorporadoraDepto
     * 
     */
    public void deleteNumeroSequencialIncorporadoraDepto()
    {
        this._has_numeroSequencialIncorporadoraDepto= false;
    } //-- void deleteNumeroSequencialIncorporadoraDepto() 

    /**
     * Method deleteNumeroSequencialUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequencialUnidadeOrganizacional()
    {
        this._has_numeroSequencialUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequencialUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoCCM'.
     * 
     * @return long
     * @return the value of field 'codigoCCM'.
     */
    public long getCodigoCCM()
    {
        return this._codigoCCM;
    } //-- long getCodigoCCM() 

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
     * Returns the value of field 'codigoPessoaIncorporadoraDepto'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaIncorporadoraDepto'.
     */
    public long getCodigoPessoaIncorporadoraDepto()
    {
        return this._codigoPessoaIncorporadoraDepto;
    } //-- long getCodigoPessoaIncorporadoraDepto() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'indicadorTributavel'.
     * 
     * @return int
     * @return the value of field 'indicadorTributavel'.
     */
    public int getIndicadorTributavel()
    {
        return this._indicadorTributavel;
    } //-- int getIndicadorTributavel() 

    /**
     * Returns the value of field 'inscricaoMunicipal'.
     * 
     * @return String
     * @return the value of field 'inscricaoMunicipal'.
     */
    public java.lang.String getInscricaoMunicipal()
    {
        return this._inscricaoMunicipal;
    } //-- java.lang.String getInscricaoMunicipal() 

    /**
     * Returns the value of field
     * 'numeroSequencialIncorporadoraDepto'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialIncorporadoraDepto'.
     */
    public int getNumeroSequencialIncorporadoraDepto()
    {
        return this._numeroSequencialIncorporadoraDepto;
    } //-- int getNumeroSequencialIncorporadoraDepto() 

    /**
     * Returns the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     */
    public int getNumeroSequencialUnidadeOrganizacional()
    {
        return this._numeroSequencialUnidadeOrganizacional;
    } //-- int getNumeroSequencialUnidadeOrganizacional() 

    /**
     * Method hasCodigoCCM
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCCM()
    {
        return this._has_codigoCCM;
    } //-- boolean hasCodigoCCM() 

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
     * Method hasCodigoPessoaIncorporadoraDepto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaIncorporadoraDepto()
    {
        return this._has_codigoPessoaIncorporadoraDepto;
    } //-- boolean hasCodigoPessoaIncorporadoraDepto() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasIndicadorTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorTributavel()
    {
        return this._has_indicadorTributavel;
    } //-- boolean hasIndicadorTributavel() 

    /**
     * Method hasNumeroSequencialIncorporadoraDepto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialIncorporadoraDepto()
    {
        return this._has_numeroSequencialIncorporadoraDepto;
    } //-- boolean hasNumeroSequencialIncorporadoraDepto() 

    /**
     * Method hasNumeroSequencialUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialUnidadeOrganizacional()
    {
        return this._has_numeroSequencialUnidadeOrganizacional;
    } //-- boolean hasNumeroSequencialUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoCCM'.
     * 
     * @param codigoCCM the value of field 'codigoCCM'.
     */
    public void setCodigoCCM(long codigoCCM)
    {
        this._codigoCCM = codigoCCM;
        this._has_codigoCCM = true;
    } //-- void setCodigoCCM(long) 

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
     * Sets the value of field 'codigoPessoaIncorporadoraDepto'.
     * 
     * @param codigoPessoaIncorporadoraDepto the value of field
     * 'codigoPessoaIncorporadoraDepto'.
     */
    public void setCodigoPessoaIncorporadoraDepto(long codigoPessoaIncorporadoraDepto)
    {
        this._codigoPessoaIncorporadoraDepto = codigoPessoaIncorporadoraDepto;
        this._has_codigoPessoaIncorporadoraDepto = true;
    } //-- void setCodigoPessoaIncorporadoraDepto(long) 

    /**
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'indicadorTributavel'.
     * 
     * @param indicadorTributavel the value of field
     * 'indicadorTributavel'.
     */
    public void setIndicadorTributavel(int indicadorTributavel)
    {
        this._indicadorTributavel = indicadorTributavel;
        this._has_indicadorTributavel = true;
    } //-- void setIndicadorTributavel(int) 

    /**
     * Sets the value of field 'inscricaoMunicipal'.
     * 
     * @param inscricaoMunicipal the value of field
     * 'inscricaoMunicipal'.
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal)
    {
        this._inscricaoMunicipal = inscricaoMunicipal;
    } //-- void setInscricaoMunicipal(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequencialIncorporadoraDepto'.
     * 
     * @param numeroSequencialIncorporadoraDepto the value of field
     * 'numeroSequencialIncorporadoraDepto'.
     */
    public void setNumeroSequencialIncorporadoraDepto(int numeroSequencialIncorporadoraDepto)
    {
        this._numeroSequencialIncorporadoraDepto = numeroSequencialIncorporadoraDepto;
        this._has_numeroSequencialIncorporadoraDepto = true;
    } //-- void setNumeroSequencialIncorporadoraDepto(int) 

    /**
     * Sets the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @param numeroSequencialUnidadeOrganizacional the value of
     * field 'numeroSequencialUnidadeOrganizacional'.
     */
    public void setNumeroSequencialUnidadeOrganizacional(int numeroSequencialUnidadeOrganizacional)
    {
        this._numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
        this._has_numeroSequencialUnidadeOrganizacional = true;
    } //-- void setNumeroSequencialUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirDependenciasNovasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.request.IncluirDependenciasNovasRequest unmarshal(java.io.Reader) 

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
